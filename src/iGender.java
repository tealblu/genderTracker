public interface iGender {
    /**
     * DATA:
     *  int num the gender identifier from shaine's CSS
     *  String hex the hex code for the gender num
     *  String notes the user-entered notes for the gender
     *  LocalDateTime creationDate the date and time the object was created
     */

    /**
     * Returns the gender formatted as yyyy-MM-dd HH:mm [num] [hex code] [description]
     *
     * @return the gender object formatted as a string
     *
     * @pre object is initialized
     *
     * @post gender = #gender
     */
    String toString();
}