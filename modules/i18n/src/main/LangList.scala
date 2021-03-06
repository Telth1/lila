package lila.i18n

import java.util.Locale
import play.api.i18n.Lang

object LangList {

  def name(lang: Lang): String = all.getOrElse(lang, lang.code)

  def nameByStr(str: String): String = I18nLangPicker.byStr(str).fold(str)(name)

  val all = Map(
    Lang(new Locale("en", "GB")) -> "English",
    Lang(new Locale("af", "ZA")) -> "Afrikaans",
    Lang(new Locale("ar", "SA")) -> "العربية",
    Lang(new Locale("as", "IN")) -> "অসমীয়া",
    Lang(new Locale("az", "AZ")) -> "Azərbaycanca",
    Lang(new Locale("be", "BY")) -> "Беларуская",
    Lang(new Locale("bg", "BG")) -> "български език",
    Lang(new Locale("bn", "BD")) -> "বাংলা",
    Lang(new Locale("bs", "BA")) -> "bosanski",
    Lang(new Locale("ca", "ES")) -> "Català, valencià",
    Lang(new Locale("cs", "CZ")) -> "čeština",
    Lang(new Locale("cv", "CU")) -> "чӑваш чӗлхи",
    Lang(new Locale("cy", "GB")) -> "Cymraeg",
    Lang(new Locale("da", "DK")) -> "Dansk",
    Lang(new Locale("de", "DE")) -> "Deutsch",
    Lang(new Locale("el", "GR")) -> "Ελληνικά",
    Lang(new Locale("en", "US")) -> "English (US)",
    Lang(new Locale("eo", "UY")) -> "Esperanto",
    Lang(new Locale("es", "ES")) -> "español, castellano",
    Lang(new Locale("et", "EE")) -> "eesti keel",
    Lang(new Locale("eu", "ES")) -> "Euskara",
    Lang(new Locale("fa", "IR")) -> "فارسی",
    Lang(new Locale("fi", "FI")) -> "suomen kieli",
    Lang(new Locale("fo", "FO")) -> "føroyskt",
    Lang(new Locale("fr", "FR")) -> "français",
    Lang(new Locale("frp", "IT")) -> "arpitan",
    Lang(new Locale("fy", "NL")) -> "Frysk",
    Lang(new Locale("ga", "IE")) -> "Gaeilge",
    Lang(new Locale("gd", "GB")) -> "Gàidhlig",
    Lang(new Locale("gl", "ES")) -> "Galego",
    Lang(new Locale("gu", "IN")) -> "ગુજરાતી",
    Lang(new Locale("he", "IL")) -> "עִבְרִית",
    Lang(new Locale("hi", "IN")) -> "हिन्दी, हिंदी",
    Lang(new Locale("hr", "HR")) -> "hrvatski",
    Lang(new Locale("hu", "HU")) -> "Magyar",
    Lang(new Locale("hy", "AM")) -> "Հայերեն",
    Lang(new Locale("ia", "IA")) -> "Interlingua",
    Lang(new Locale("id", "ID")) -> "Bahasa Indonesia",
    Lang(new Locale("io", "IO")) -> "Ido",
    Lang(new Locale("is", "IS")) -> "Íslenska",
    Lang(new Locale("it", "IT")) -> "Italiano",
    Lang(new Locale("ja", "JP")) -> "日本語",
    Lang(new Locale("jbo", "EN")) -> "lojban",
    Lang(new Locale("jv", "ID")) -> "basa Jawa",
    Lang(new Locale("ka", "GE")) -> "ქართული",
    Lang(new Locale("kab", "KA")) -> "Taqvaylit",
    Lang(new Locale("kk", "KZ")) -> "қазақша",
    Lang(new Locale("kn", "IN")) -> "ಕನ್ನಡ",
    Lang(new Locale("ko", "KR")) -> "한국어",
    Lang(new Locale("ky", "KG")) -> "кыргызча",
    Lang(new Locale("la", "LA")) -> "lingua Latina",
    Lang(new Locale("lt", "LT")) -> "lietuvių kalba",
    Lang(new Locale("lv", "LV")) -> "latviešu valoda",
    Lang(new Locale("mg", "MG")) -> "fiteny malagasy",
    Lang(new Locale("mk", "MK")) -> "македонски јази",
    Lang(new Locale("ml", "IN")) -> "മലയാളം",
    Lang(new Locale("mn", "MN")) -> "монгол",
    Lang(new Locale("mr", "IN")) -> "मराठी",
    Lang(new Locale("nb", "NO")) -> "Norsk bokmål",
    Lang(new Locale("nl", "NL")) -> "Nederlands",
    Lang(new Locale("nn", "NO")) -> "Norsk nynorsk",
    Lang(new Locale("pi", "IN")) -> "पालि",
    Lang(new Locale("pl", "PL")) -> "polski",
    Lang(new Locale("ps", "AF")) -> "پښتو",
    Lang(new Locale("pt", "PT")) -> "Português",
    Lang(new Locale("pt", "BR")) -> "Português (BR)",
    Lang(new Locale("ro", "RO")) -> "Română",
    Lang(new Locale("ru", "RU")) -> "русский язык",
    Lang(new Locale("sa", "IN")) -> "संस्कृत",
    Lang(new Locale("sk", "SK")) -> "slovenčina",
    Lang(new Locale("sl", "SI")) -> "slovenščina",
    Lang(new Locale("sq", "AL")) -> "Shqip",
    Lang(new Locale("sr", "SP")) -> "Српски језик",
    Lang(new Locale("sv", "SE")) -> "svenska",
    Lang(new Locale("sw", "KE")) -> "Kiswahili",
    Lang(new Locale("ta", "IN")) -> "தமிழ்",
    Lang(new Locale("tg", "TJ")) -> "тоҷикӣ",
    Lang(new Locale("th", "TH")) -> "ไทย",
    Lang(new Locale("tl", "PH")) -> "Tagalog",
    Lang(new Locale("tp", "TP")) -> "toki pona",
    Lang(new Locale("tr", "TR")) -> "Türkçe",
    Lang(new Locale("uk", "UA")) -> "українська",
    Lang(new Locale("ur", "IN")) -> "اُردُو",
    Lang(new Locale("vi", "VN")) -> "Tiếng Việt",
    Lang(new Locale("yo", "NG")) -> "Yorùbá",
    Lang(new Locale("zh", "CN")) -> "中文",
    Lang(new Locale("zh", "TW")) -> "繁體中文",
    Lang(new Locale("zu", "ZA")) -> "isiZulu"
  )
}
