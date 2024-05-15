package diego.nobre.HannahAI.factory;

import java.time.Duration;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;

public class AiAssistantFactory {

	public static ChatLanguageModel createChatLanguageModel () {
		return OpenAiChatModel.builder()
				.baseUrl("http://localhost:1234/v1")
				.apiKey("ignore")
				.logRequests(true)
				.timeout(Duration.ofSeconds(300))
				.build();
	}
}
