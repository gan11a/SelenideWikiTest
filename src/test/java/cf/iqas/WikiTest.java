package cf.iqas;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class WikiTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }
    @Test
    void wikiTest(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body").shouldHave(text("Soft assertions"));
        $("#wiki-body").$(byText("Soft assertions")).click();
        $("#wiki-content").shouldHave(text("JUnit5"),text("@ExtendWith({SoftAssertsExtension.class})"),text("$(\"#first\").should(visible).click();"));
    }
}

