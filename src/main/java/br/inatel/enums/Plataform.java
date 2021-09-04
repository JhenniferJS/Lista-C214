package br.inatel.enums;

import lombok.Getter;

@Getter
public enum Plataform {

    PLATFORM_2600 ("2600"),
    PLATFORM_3DS ("3DS"),
    PLATFORM_DS ("DS"),
    PLATFORM_GB ("GB"),
    PLATFORM_GBA ("GBA"),
    PLATFORM_N64 ("N64"),
    PLATFORM_NES ("NES"),
    PLATFORM_PC ("PC"),
    PLATFORM_PS ("PS"),
    PLATFORM_PS2 ("PS2"),
    PLATFORM_PS3 ("PS3"),
    PLATFORM_PS4 ("PS4"),
    PLATFORM_PSP ("PSP"),
    PLATFORM_SNES ("SNES"),
    PLATFORM_WII ("WII"),
    PLATFORM_X360 ("X360"),
    PLATFORM_XB ("XB");

    private String platform;

    Plataform(String platform) {

        this.platform = platform;
    }
}


