package com.pengrad.telegrambot.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * Stas Parshin
 * 23 July 2017
 */
public class StickerSet implements Serializable {
    private final static long serialVersionUID = 0L;

    private String name;
    private String title;
    private Boolean is_animated;
    private Boolean contains_masks;
    private Sticker[] stickers;
    private PhotoSize thumb;

    public String name() {
        return name;
    }

    public String title() {
        return title;
    }

    public Boolean isAnimated() {
        return is_animated;
    }

    public Boolean containsMasks() {
        return contains_masks;
    }

    public Sticker[] stickers() {
        return stickers;
    }

    public PhotoSize thumb() {
        return thumb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StickerSet that = (StickerSet) o;

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(title, that.title)) return false;
        if (!Objects.equals(is_animated, that.is_animated)) return false;
        if (!Objects.equals(contains_masks, that.contains_masks))
            return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(stickers, that.stickers)) return false;
        if (!Objects.equals(thumb, that.thumb)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (is_animated != null ? is_animated.hashCode() : 0);
        result = 31 * result + (contains_masks != null ? contains_masks.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(stickers);
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StickerSet{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", is_animated=" + is_animated +
                ", contains_masks=" + contains_masks +
                ", stickers=" + Arrays.toString(stickers) +
                ", thumb=" + thumb +
                '}';
    }
}
