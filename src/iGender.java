public interface iGender {
    /**
     * DATA:
     *  int num the gender identifier from shaine's CSS
     */

    /**
     * Returns the gender formatted as a string
     *
     * @return the gender object formatted as a string
     *
     * @pre object is initialized
     *
     * @post gender = #gender
     */
    public String toString();

    public String numToHex(int num);
}