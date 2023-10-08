class ItalicTextDecorator implements TextFormatter {
    private TextFormatter decoratedText;

    public ItalicTextDecorator(TextFormatter decoratedText) {
        this.decoratedText = decoratedText;
    }

    @Override
    public String format(String text) {
        return "<i>" + decoratedText.format(text) + "</i>";
    }
}