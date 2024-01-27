public enum Holidays {
  NOHOLIDAY("Нет праздника"),
  NEWYEAR("Новый Год"),
  EIGHTMARTH ("8 марта"),
  TWENTYTHIRDFEBRUARY ("23 февраля");


  private final String label;

  Holidays (String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

}
