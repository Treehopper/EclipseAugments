package eu.hohenegger.c0ffee_tips;

public class ConverterUtil {
	private final static String HEX_PREFIX = "0x";
	
	public static String convert2dec(String parameter) {
		String result = "";
		
		parameter = preprocess(parameter);
		
		try {
			if (parameter.startsWith(HEX_PREFIX)) {
				String numberString = parameter.substring(HEX_PREFIX.length(), parameter.length());
				
				result = long2hex(numberString);
			} else {
				result = hex2long(parameter);
			}
		} catch (NumberFormatException e) {
			//ignore
		}
		return result;
	}
	
	public static String convert2bin(String parameter) {
		parameter = preprocess(parameter);
		if (parameter.startsWith(HEX_PREFIX)) {
			parameter = parameter.substring(HEX_PREFIX.length(), parameter.length());
		}
			
		long parsedLong = Long.parseLong(parameter, 16);
		return Long.toBinaryString(parsedLong);
	}

	private static String preprocess(String parameter) {
		if (parameter.startsWith("\"") && parameter.endsWith("\"")) {
			parameter = parameter.substring(1, parameter.length() - 1);
		}
		if (parameter.endsWith("l") || parameter.endsWith("f") || parameter.endsWith("d")) {
			parameter = parameter.substring(0, parameter.length() - 1);
		}
		return parameter;
	}


	private static String hex2long(String parameter) {
		return String.format(HEX_PREFIX+"%x", Long.valueOf(parameter));
	}


	private static String long2hex(String numberString) {
		long parseLong = Long.parseLong(numberString, 16);
		return String.format("%d", parseLong);
	}

}
