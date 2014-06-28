package com.highlight.template;

public class TemplateException extends RuntimeException {
    public TemplateException(Exception e) {
        super(e);
    }

    public TemplateException(String s) {
        super(s);
    }
}
