public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  String in = "";
  String fin = "";
  for(int i = 0; i < strings.length; i++){
    in = ""+strings[i].charAt(0);
    fin = ""+strings[i].charAt(strings[i].length() - 1);
    map.put(in, fin);
  }
  return map;
}
