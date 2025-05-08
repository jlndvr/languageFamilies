class SinoTibetan extends Language {

  public SinoTibetan(String nm, int nums) {
    super(nm, nums, "Asia", "subject-object-verb");
    if (nm.contains("Chinese")) {
      this.wordOrder = "subject-verb-object";
    }
  }
  
}
