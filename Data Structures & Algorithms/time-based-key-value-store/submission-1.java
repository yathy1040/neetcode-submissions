class TimeMap {
    
    HashMap<String, ArrayList<Entry>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        ArrayList<Entry> values = new ArrayList<>();
        Entry valuea = new Entry();
        valuea.value = value;
        valuea.timestamp = timestamp;
        values.add(valuea);
        ArrayList<Entry> existing = map.putIfAbsent(key, values);
        if (existing != null) {
            existing.add(valuea);
        }
    }
    
    public String get(String key, int timestamp) {
        String result = "";
        if (!map.containsKey(key)) {
            return result;
        }
        ArrayList<Entry> list  = map.get(key);
        if (list.get(0).timestamp > timestamp){
            return result;
        }
        else {
            int l = 0;
            int r = list.size() - 1;
            while (l <= r) {
                int mid = l + (r-l)/2;
                if (list.get(mid).timestamp <= timestamp) {
                    result = list.get(mid).value;
                    l = mid + 1;
                }
                else {
                    r = mid - 1;
                }
            }
            
        }
        return result;
    }
}

class Entry {
    int timestamp;
    String value;
}
