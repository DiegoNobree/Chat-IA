package diego.nobre.HannahAI.controllers;

import org.slf4j.helpers.Reporter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.langchain4j.model.chat.ChatLanguageModel;
import diego.nobre.HannahAI.dtos.MessageDTO;
import diego.nobre.HannahAI.factory.AiAssistantFactory;
import diego.nobre.HannahAI.factory.ContentRetrieverFactory;
import diego.nobre.HannahAI.factory.DocumentAssistantFactory;
import diego.nobre.HannahAI.factory.EmbeddingFactory;

@RestController
@RequestMapping("/chat")
public class AiAssistantController {
	
	@PostMapping
	public ResponseEntity chat (@RequestBody MessageDTO messageDTO) {
		  ChatLanguageModel chatModel = AiAssistantFactory.createChatLanguageModel();
		  var embeddingModel = EmbeddingFactory.createEmbeddingModel();
		  var embeddingStore = EmbeddingFactory.createEmbeddingStore();
		  var fileContentRetriever = ContentRetrieverFactory.createFileContentRetriever(
		          embeddingModel,
		          embeddingStore,
		          "movies.txt");

		  var documentAssistant = new DocumentAssistantFactory(chatModel, fileContentRetriever);
		  String response = documentAssistant.chat(messageDTO.message());
		  return ResponseEntity.ok().body(response);
	}
}
