package null_deref;

import java.util.List;
import java.util.Map;

public class EnvUtils {
	static String selfAmoryTag;
	static String selfVipserverTag;
	static String selfLocationTag;

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

	public static void setVipserver(Map<String, List<String>> headers) {
		if (headers != null) {
			List<String> vipserverTagTmp = headers.get("vipserver");

			if (vipserverTagTmp == null) {
				if (selfVipserverTag != null) {
					selfVipserverTag = null;
				}
			} else {
				String vipserverTagTmpStr = listToString(vipserverTagTmp);
				if (!vipserverTagTmpStr.equals(selfVipserverTag)) {
					selfVipserverTag = vipserverTagTmpStr;
				}
			}
		}
	}

	public static void setLocation(Map<String, List<String>> headers) {
		if (headers != null) {
			List<String> locationTagTmp = headers.get("location");

			if (locationTagTmp == null) {
				if (selfLocationTag != null) {
					selfLocationTag = null;
				}
			} else {
				String locationTagTmpStr = listToString(locationTagTmp);
				if (!locationTagTmpStr.equals(selfLocationTag)) {
					selfLocationTag = locationTagTmpStr;
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
