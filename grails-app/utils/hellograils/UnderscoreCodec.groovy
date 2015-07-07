package hellograils

class UnderscoreCodec {

	static encode(o) {
		if (!o) return o
		def isLowerCase = { c -> Character.isLowerCase(c as char) }
		def isUpperCase = { c -> Character.isUpperCase(c as char) }
		def sb = new StringBuilder(o.toString())
		(1..sb.length()-2).each { int i ->
			if (isLowerCase(sb[i-1]) &&
			isUpperCase(sb[i]) &&
			isLowerCase(sb[i+1])) {
				sb.insert i++, '_'
			}
		}
		sb.toString()
	}
	
	static decode(o) {
		o?.toString()?.replaceAll '_', ''
	}
	
}
