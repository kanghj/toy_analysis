package null_deref;

import java.util.List;
import java.util.Map;

public class EnvUtils {
	static String selfAmoryTag;
	
	public static void setSelfEnv(Map<String, List<String>> headers) {
        if (headers != null) {
            List<String> amoryTagTmp = headers.get("amory");
            
			if (amoryTagTmp == null) {
                if (selfAmoryTag != null) {
                    selfAmoryTag = null;
                }
            } else {
                String amoryTagTmpStr = listToString(amoryTagTmp);
                if (!amoryTagTmpStr.equals(selfAmoryTag)) {
                    selfAmoryTag = amoryTagTmpStr;
                }
            }      
        }
    }
    
    private static String listToString(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (String string : list) {
            result.append(string);
            result.append(',');
        }
        return result.substring(0, result.length() - 1);
    }
}
