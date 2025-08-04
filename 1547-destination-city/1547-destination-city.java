class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> city=new HashSet<>();
        for(List<String> path:paths){
            city.add(path.get(0));
        }
        for(List<String> path:paths){
            String destination=path.get(1);
            if(!city.contains(destination)){
                return destination;
            } 
        }
        return "";

    }
}