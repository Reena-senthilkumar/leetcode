public class wordcheck {
        public boolean isValid(String word) {
            boolean hasl = word.length() > 3;
            boolean hasd = word.matches(".*\\d.*");
            boolean hasv = word.matches(".*[aeiouAEIOU].*");
            boolean hasc = word.matches(".*[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z].*");
            boolean hass = !word.matches(".*[@#$].*");
            boolean result = hasl && hasv && hasd && hass;
            return result;
        }
    }
    
}
