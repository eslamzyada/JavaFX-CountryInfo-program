/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countryinfo;

/**
 *
 * @author MS
 */
import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CountryInfo extends Application {

    

    public static void main(String[] args) {
        launch(args);
    }
    private final String[] countryNames = {"Palestine", "Eygpt", "Saudi Arabia", "Iraq", "Algeria", "Morroco", "Lebanon", "Syria", "Jordan", "Tunisia", "Libya",
    "Sudan", "Somalia", "Djibouti", "the Comoros Islands", "Mauritania", "Bahrain", "UAE", "Qatar", "Oman", "Yemen", "Kuwait",};
    
    private final String[] descriptions = {"a Middle Eastern nation-state covering 27,027 km2 of land; sharing borders with Jordan, Egypt, Lebanon, and Syria.",
    " the world's earliest and greatest civilizations, with a unified kingdom first surfacing around 3,200 B.C. With a population estimated at more than 99 million",
    "The Kingdom of Saudi Arabia is the largest Arab country of the Middle East. It is bordered by Jordan and Iraq on the north and northeast, Kuwait, Qatar, Bahrain and the United Arab Emirates on the east, Oman on the southeast, and Yemen on the south.",
    "Iraq is one of the easternmost countries of the Arab world, located at about the same latitude as the southern United States. It is bordered to the north by Turkey, to the east by Iran, to the west by Syria and Jordan, and to the south by Saudi Arabia and Kuwait.",
    "Algeria is a country located in Northern Africa bordering the Mediterranean Sea. It is considered the gateway between Africa and Europe. Neighboring countries include Libya, Mali, Mauritania, Morocco, Niger, Tunisia, and Western Sahara. Algeria is mostly desert with a few mountains and a narrow coastal plain.",
    "Morocco is located in the northwest corner of Africa and is bordered by the North Atlantic Ocean and the Mediterranean Sea. Algeria and Western Sahara are the land borders to the south and east. Morocco is about the same size as California. The high Atlas Mountains separate the mild coastline from the harsh Sahara.",
    "It is part of the Levant region of the Middle East. Lebanon is home to more than five million people and covers an area of 10,452 square kilometres (4,036 sq mi), making it the second-smallest country in continental Asia.",
    "The country occupies an area of 185,180 km², it is about twice the size of Portugal or slightly larger than U.S. state of North Dakota. Syria has a population of 24 million people, capital city is Damascus, spoken languages are Arabic (official), English and French (widely understood), Kurdish, Armenian, Aramaic.",
    "Is an Arab Muslim country, located in the north of the Arabian Peninsula and in West Asia. Bordered by Syria to the north, Iraq to the east, Saudi Arabia to the south and south-east, and Palestine (the West Bank) to the west. Jordan is named to the Jordan River, which passes on its western border, and Amman is capital.",
    "Tunisia is a country in Northern Africa bordering the Mediterranean Sea. Neighboring countries include Algeria and Libya. The geography of Tunisia is varied and consists of mountains in the north and a semiarid south that merges into the Sahara.",
    "Libya is a country located in North Africa. Bordering the Mediterranean Sea, Libya is surrounded by Egypt, Sudan, Chad, Niger, Algeria, and Tunisia. More than 90% of the country is desert or semi-desert, and there are limited natural freshwater resources.",
    "Sudan lies at the crossroads of Sub-Saharan Africa and the Middle East, bordering the Red Sea. It shares its border with seven countries: Libya, Egypt, Chad, the Central African Republic, South Sudan, Ethiopia, and Eritrea.",
    "Somalia, easternmost country of Africa, on the Horn of Africa. It extends from just south of the Equator northward to the Gulf of Aden and occupies an important geopolitical position between sub-Saharan Africa and the countries of Arabia and southwestern Asia.",
    "It shares borders with Eritrea, Ethiopia and Somalia and has just over 300 km of coastline along the Red Sea and Gulf of Aden. The country's landscape is varied. Djibouti has an elevation range exceeding 2000 metres, running from Lac Assal, at 155 metres below sea level, to Moussa Ali, at around 2 km above sea level.",
    "The Comoros are a group of islands at the northern end of the Mozambique Channel of the Indian Ocean, between Madagascar and the southeast African mainland, about 180 miles (290 km) off the eastern coast of Africa.",
    "Mauritania's population consists of about 70% Moors - people of Amazigh (Berber) and Arab descent, and 30% non-Arabic speaking Africans: Wolof, Bambara, and Fulas. Spoken languages are Arabic (official), Wolof (official), and French. Mauritania is an Islamic country; the majority are Sunni Muslims.",
    "Bahrain, small Arab state situated in a bay on the southwestern coast of the Persian Gulf. It is an archipelago consisting of Bahrain Island and some 30 smaller islands. Its name is from the Arabic term al-baḥrayn, meaning “two seas.”",
    "The United Arab Emirates (UAE) is situated in the Southeast of the Arabian Peninsula, bordering Oman and Saudi Arabia. In December 1971, the UAE became a federation of six emirates - Abu Dhabi, Dubai, Sharjah, Ajman, Umm Al-Quwain, and Fujairah, while the seventh emirate, Ras Al Khaimah, joined the federation in 1972.",
    "The State of Qatar is a sovereign and independent state in the Middle East, occupying a peninsula that juts into the Arabian Gulf. Since its complete independence from Britain in 1971, Qatar has emerged as one of the world's most important producers of oil and gas.",
    "Oman is located on the southeastern edge of the Arabian Peninsula, bordering the Arabian Sea and the Gulf of Oman; at the Musandam Peninsula in the north of the country, it borders the Strait of Hormuz and the Persian Gulf.",
    "The Republic of Yemen is an Arab country occupying the southwestern to southern end of the Arabian Peninsula. It is bordered by Saudi Arabia to the north, the Red Sea to the west, the Gulf of Aden and Arabian Sea to the south, and Oman to the east.",
    "A small emirate nestled between Iraq and Saudi Arabia, Kuwait is situated in a section of one of the driest, least-hospitable deserts on Earth. Its shore, however, includes Kuwait Bay, a deep harbour on the Persian Gulf. There, in the 18th century, Bedouin from the interior founded a trading post."};
    
    private final String[] flagsUrls = {"https://worldflags.net/assets/img/flags/palestine-flag.png",
            "https://worldflags.net/assets/img/flags/egypt-flag.png",
            "https://worldflags.net/assets/img/flags/saudi-arabia-flag.png",
            "https://worldflags.net/assets/img/flags/iraq-flag.png",
            "https://worldflags.net/assets/img/flags/algeria-flag.png",
            "https://worldflags.net/assets/img/flags/morocco-flag.png",
            "https://worldflags.net/assets/img/flags/lebanon-flag.png",
            "https://worldflags.net/assets/img/flags/syria-flag.png",
            "https://worldflags.net/assets/img/flags/jordan-flag.png",
            "https://worldflags.net/assets/img/flags/tunisia-flag.png",
            "https://worldflags.net/assets/img/flags/libya-flag.png",
            "https://worldflags.net/assets/img/flags/sudan-flag.png",
            "https://worldflags.net/assets/img/flags/somalia-flag.png",
            "https://worldflags.net/assets/img/flags/djibouti-flag.png",
            "https://worldflags.net/assets/img/flags/comoros-flag.png",
            "https://worldflags.net/assets/img/flags/mauritania-flag.png",
            "https://worldflags.net/assets/img/flags/bahrain-flag.png",
            "https://worldflags.net/assets/img/flags/united-arab-emirates-flag.png",
            "https://worldflags.net/assets/img/flags/qatar-flag.png",
            "https://worldflags.net/assets/img/flags/oman-flag.png",
            "https://worldflags.net/assets/img/flags/yemen-flag.png",
            "https://worldflags.net/assets/img/flags/kuwait-flag.png"};

@Override
public void start(Stage stage) throws Exception {
  
    BorderPane border = new BorderPane();
    border.setPadding(new Insets(25, 25, 25, 25));

    ComboBox<String> combo = new ComboBox<>();
    border.setTop(combo);
    combo.getItems().addAll(countryNames);

    TextArea textArea = new TextArea();
    textArea.setMaxWidth(220);
    textArea.setMaxHeight(220);
    textArea.setEditable(false);
    border.setRight(textArea);

    ImageView imageView = new ImageView();
    Label label = new Label();
    ObjectProperty<ImageView> selectedImage = new SimpleObjectProperty<>();
    selectedImage.addListener((observable, oldValue, newValue) -> {
        imageView.setImage(newValue.getImage());
    });
    imageView.setFitHeight(180);
    imageView.setFitWidth(180);

    combo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
        int index = combo.getSelectionModel().getSelectedIndex();
        StringProperty selectedText = new SimpleStringProperty(descriptions[index]);
        selectedImage.set(new ImageView(new Image(flagsUrls[index])));
        StringProperty selectedCountry = new SimpleStringProperty(countryNames[index]);
        label.textProperty().bind(selectedCountry);
        textArea.textProperty().bind(selectedText);
        border.setLeft(new VBox(imageView,label));
    });

    stage.setTitle("CountryFlags");
    Scene scene = new Scene(border, 450, 400);
    stage.setScene(scene);
    stage.show();

    }
}

