package br.inatel.enums;

import lombok.Getter;

@Getter
public enum Publisher {

    ACTIVION ("ACTIVISION"),
    ATARI ("ATARI"),
    BETHESDA_SOFTWORKS ("BETHESDA SOFTWORKS"),
    ELECTRONIC_ARTS ("ELECTRONIC ARTS"),
    MICROSOFT_GAMES_STUDIO ("MICROSOFT GAMES STUDIO"),
    NITENDO ("NITENDO"),
    SEGA ("SEGA"),
    SONY_COMPUTER_ENTERTAINMENT ("SONY COMPUTER ENTERTAINMENT"),
    SQUARE_SOFT ("SQUARESOFT"),
    TAKE_TWO_INTERACTIVE ("TAKE-TWO INTERACTIVE"),
    UBISOFT ("UBISOFT");

    private String publisher;

    Publisher(String publisher) {

        this.publisher = publisher;
    }
}
