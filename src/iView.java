public interface iView {

    /**
     * Displays text
     *
     * @param txt the text to display
     *
     * @pre none
     *
     * @post none
     */
    public void displayText(String txt);

    /**
     * Collects and returns text input
     *
     * @return a string containing the text input
     *
     * @pre none
     *
     * @post none
     */
    public String getTextInput();
}
