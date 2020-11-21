package finalProject.pages;

import com.codeborne.selenide.impl.Html;

import static com.codeborne.selenide.WebDriverRunner.source;

public class CommonPage {

    public void validatePage() {
        Html.text.containsCaseSensitive(source(), "Lielākais interneta veikals Latvijā | 1a.lv");

    }
}
