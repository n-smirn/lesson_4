package lesson_4;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class selenid {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillRegFormTest() {
        open("/selenide/selenide");
        //Откройте страницу Selenide в Github
        //Перейдите в раздел Wiki проекта
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
    }}