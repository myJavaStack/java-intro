class Stock {
  private String symbol;
  private String name;
  private double previousClosingPrice;
  private double currentPrice;

  public Stock() {
  }

  public Stock(String symbol, String name) {
    this.symbol = symbol;
    this.name = name;
  }

  // getter methods
  public double getPreviousClosingPrice() {
    return previousClosingPrice;
  }
  
  public double getCurrentPrice() {
    return currentPrice;
  }
  
  public String getName() {
    return name;
  }
  
  public String getSymbol() {
    return symbol;
  }
  
  //setter methods
  public void setCurrentPrice(double newCurrentPrice) {
    currentPrice = newCurrentPrice;
  }
  
  public void setPreviousClosingPrice(double newPreviousClosingPrice) {
    previousClosingPrice = newPreviousClosingPrice;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }
  
  
  // other methods
  public double getChangePercent() {
    return (currentPrice - previousClosingPrice) /
      previousClosingPrice;
  }
}
