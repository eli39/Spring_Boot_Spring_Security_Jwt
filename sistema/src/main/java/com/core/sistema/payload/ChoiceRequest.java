package com.core.sistema.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by Eli Álvarez on 01/08/19.
 */

public class ChoiceRequest {
    @NotBlank
    @Size(max = 40)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
