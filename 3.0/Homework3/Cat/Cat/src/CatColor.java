public enum CatColor {
    BLACK_CAT("Black","Черный"),
    WHITE_CAT("White","Белый"),
    RED_CAT("Red","Рыжий"),
    SPOTY_CAT("Spoty","Пятнистый"),
    NO_NAME_COLOR_CAT("Whithout color","Без цвета");
    private String en;
    private String ru;
    private CatColor(String en, String ru){
        this.en = en;
        this.ru = ru;
    }
    public String getRuColor(){
        return this.ru;
    }
    public String getEnColor(){
        return this.en;
    }

}
