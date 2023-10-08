class BoldTextDecorator implements TextFormatter {
    private TextFormatter decoratedText;

    public BoldTextDecorator(TextFormatter decoratedText) {
        this.decoratedText = decoratedText;
    }

    @Override
    public String format(String text) {
        return "<b>" + decoratedText.format(text) + "</b>";
    }
}