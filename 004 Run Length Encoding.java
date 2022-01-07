class GfG
 {
	String encode(String s)
	{
	    char prev = '\0';
	    int count = 0;
	    StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c == prev) {
                count += 1;
            }
            else {
                if(count > 0) {
                    sb.append(prev+""+count);
                }
                prev = c;
                count = 1;
            }
        }
        sb.append(prev+""+count);
        return sb.toString();
	}
	
 }
