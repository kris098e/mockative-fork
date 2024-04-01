package myTests

import io.mockk.mockk
import compare.frameworks.classes.*
import io.mockk.every
import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals

class MockHelloClasses {
val mock1: HelloClass1 = mockk()
val mock2: HelloClass2 = mockk()
val mock3: HelloClass3 = mockk()
val mock4: HelloClass4 = mockk()
val mock5: HelloClass5 = mockk()
val mock6: HelloClass6 = mockk()
val mock7: HelloClass7 = mockk()
val mock8: HelloClass8 = mockk()
val mock9: HelloClass9 = mockk()
val mock10: HelloClass10 = mockk()
val mock11: HelloClass11 = mockk()
val mock12: HelloClass12 = mockk()
val mock13: HelloClass13 = mockk()
val mock14: HelloClass14 = mockk()
val mock15: HelloClass15 = mockk()
val mock16: HelloClass16 = mockk()
val mock17: HelloClass17 = mockk()
val mock18: HelloClass18 = mockk()
val mock19: HelloClass19 = mockk()
val mock20: HelloClass20 = mockk()
val mock21: HelloClass21 = mockk()
val mock22: HelloClass22 = mockk()
val mock23: HelloClass23 = mockk()
val mock24: HelloClass24 = mockk()
val mock25: HelloClass25 = mockk()
val mock26: HelloClass26 = mockk()
val mock27: HelloClass27 = mockk()
val mock28: HelloClass28 = mockk()
val mock29: HelloClass29 = mockk()
val mock30: HelloClass30 = mockk()
val mock31: HelloClass31 = mockk()
val mock32: HelloClass32 = mockk()
val mock33: HelloClass33 = mockk()
val mock34: HelloClass34 = mockk()
val mock35: HelloClass35 = mockk()
val mock36: HelloClass36 = mockk()
val mock37: HelloClass37 = mockk()
val mock38: HelloClass38 = mockk()
val mock39: HelloClass39 = mockk()
val mock40: HelloClass40 = mockk()
val mock41: HelloClass41 = mockk()
val mock42: HelloClass42 = mockk()
val mock43: HelloClass43 = mockk()
val mock44: HelloClass44 = mockk()
val mock45: HelloClass45 = mockk()
val mock46: HelloClass46 = mockk()
val mock47: HelloClass47 = mockk()
val mock48: HelloClass48 = mockk()
val mock49: HelloClass49 = mockk()
val mock50: HelloClass50 = mockk()
val mock51: HelloClass51 = mockk()
val mock52: HelloClass52 = mockk()
val mock53: HelloClass53 = mockk()
val mock54: HelloClass54 = mockk()
val mock55: HelloClass55 = mockk()
val mock56: HelloClass56 = mockk()
val mock57: HelloClass57 = mockk()
val mock58: HelloClass58 = mockk()
val mock59: HelloClass59 = mockk()
val mock60: HelloClass60 = mockk()
val mock61: HelloClass61 = mockk()
val mock62: HelloClass62 = mockk()
val mock63: HelloClass63 = mockk()
val mock64: HelloClass64 = mockk()
val mock65: HelloClass65 = mockk()
val mock66: HelloClass66 = mockk()
val mock67: HelloClass67 = mockk()
val mock68: HelloClass68 = mockk()
val mock69: HelloClass69 = mockk()
val mock70: HelloClass70 = mockk()
val mock71: HelloClass71 = mockk()
val mock72: HelloClass72 = mockk()
val mock73: HelloClass73 = mockk()
val mock74: HelloClass74 = mockk()
val mock75: HelloClass75 = mockk()
val mock76: HelloClass76 = mockk()
val mock77: HelloClass77 = mockk()
val mock78: HelloClass78 = mockk()
val mock79: HelloClass79 = mockk()
val mock80: HelloClass80 = mockk()
val mock81: HelloClass81 = mockk()
val mock82: HelloClass82 = mockk()
val mock83: HelloClass83 = mockk()
val mock84: HelloClass84 = mockk()
val mock85: HelloClass85 = mockk()
val mock86: HelloClass86 = mockk()
val mock87: HelloClass87 = mockk()
val mock88: HelloClass88 = mockk()
val mock89: HelloClass89 = mockk()
val mock90: HelloClass90 = mockk()
val mock91: HelloClass91 = mockk()
val mock92: HelloClass92 = mockk()
val mock93: HelloClass93 = mockk()
val mock94: HelloClass94 = mockk()
val mock95: HelloClass95 = mockk()
val mock96: HelloClass96 = mockk()
val mock97: HelloClass97 = mockk()
val mock98: HelloClass98 = mockk()
val mock99: HelloClass99 = mockk()
val mock100: HelloClass100 = mockk()
val mock101: HelloClass101 = mockk()
val mock102: HelloClass102 = mockk()
val mock103: HelloClass103 = mockk()
val mock104: HelloClass104 = mockk()
val mock105: HelloClass105 = mockk()
val mock106: HelloClass106 = mockk()
val mock107: HelloClass107 = mockk()
val mock108: HelloClass108 = mockk()
val mock109: HelloClass109 = mockk()
val mock110: HelloClass110 = mockk()
val mock111: HelloClass111 = mockk()
val mock112: HelloClass112 = mockk()
val mock113: HelloClass113 = mockk()
val mock114: HelloClass114 = mockk()
val mock115: HelloClass115 = mockk()
val mock116: HelloClass116 = mockk()
val mock117: HelloClass117 = mockk()
val mock118: HelloClass118 = mockk()
val mock119: HelloClass119 = mockk()
val mock120: HelloClass120 = mockk()
val mock121: HelloClass121 = mockk()
val mock122: HelloClass122 = mockk()
val mock123: HelloClass123 = mockk()
val mock124: HelloClass124 = mockk()
val mock125: HelloClass125 = mockk()
val mock126: HelloClass126 = mockk()
val mock127: HelloClass127 = mockk()
val mock128: HelloClass128 = mockk()
val mock129: HelloClass129 = mockk()
val mock130: HelloClass130 = mockk()
val mock131: HelloClass131 = mockk()
val mock132: HelloClass132 = mockk()
val mock133: HelloClass133 = mockk()
val mock134: HelloClass134 = mockk()
val mock135: HelloClass135 = mockk()
val mock136: HelloClass136 = mockk()
val mock137: HelloClass137 = mockk()
val mock138: HelloClass138 = mockk()
val mock139: HelloClass139 = mockk()
val mock140: HelloClass140 = mockk()
val mock141: HelloClass141 = mockk()
val mock142: HelloClass142 = mockk()
val mock143: HelloClass143 = mockk()
val mock144: HelloClass144 = mockk()
val mock145: HelloClass145 = mockk()
val mock146: HelloClass146 = mockk()
val mock147: HelloClass147 = mockk()
val mock148: HelloClass148 = mockk()
val mock149: HelloClass149 = mockk()
val mock150: HelloClass150 = mockk()
val mock151: HelloClass151 = mockk()
val mock152: HelloClass152 = mockk()
val mock153: HelloClass153 = mockk()
val mock154: HelloClass154 = mockk()
val mock155: HelloClass155 = mockk()
val mock156: HelloClass156 = mockk()
val mock157: HelloClass157 = mockk()
val mock158: HelloClass158 = mockk()
val mock159: HelloClass159 = mockk()
val mock160: HelloClass160 = mockk()
val mock161: HelloClass161 = mockk()
val mock162: HelloClass162 = mockk()
val mock163: HelloClass163 = mockk()
val mock164: HelloClass164 = mockk()
val mock165: HelloClass165 = mockk()
val mock166: HelloClass166 = mockk()
val mock167: HelloClass167 = mockk()
val mock168: HelloClass168 = mockk()
val mock169: HelloClass169 = mockk()
val mock170: HelloClass170 = mockk()
val mock171: HelloClass171 = mockk()
val mock172: HelloClass172 = mockk()
val mock173: HelloClass173 = mockk()
val mock174: HelloClass174 = mockk()
val mock175: HelloClass175 = mockk()
val mock176: HelloClass176 = mockk()
val mock177: HelloClass177 = mockk()
val mock178: HelloClass178 = mockk()
val mock179: HelloClass179 = mockk()
val mock180: HelloClass180 = mockk()
val mock181: HelloClass181 = mockk()
val mock182: HelloClass182 = mockk()
val mock183: HelloClass183 = mockk()
val mock184: HelloClass184 = mockk()
val mock185: HelloClass185 = mockk()
val mock186: HelloClass186 = mockk()
val mock187: HelloClass187 = mockk()
val mock188: HelloClass188 = mockk()
val mock189: HelloClass189 = mockk()
val mock190: HelloClass190 = mockk()
val mock191: HelloClass191 = mockk()
val mock192: HelloClass192 = mockk()
val mock193: HelloClass193 = mockk()
val mock194: HelloClass194 = mockk()
val mock195: HelloClass195 = mockk()
val mock196: HelloClass196 = mockk()
val mock197: HelloClass197 = mockk()
val mock198: HelloClass198 = mockk()
val mock199: HelloClass199 = mockk()
val mock200: HelloClass200 = mockk()
val mock201: HelloClass201 = mockk()
val mock202: HelloClass202 = mockk()
val mock203: HelloClass203 = mockk()
val mock204: HelloClass204 = mockk()
val mock205: HelloClass205 = mockk()
val mock206: HelloClass206 = mockk()
val mock207: HelloClass207 = mockk()
val mock208: HelloClass208 = mockk()
val mock209: HelloClass209 = mockk()
val mock210: HelloClass210 = mockk()
val mock211: HelloClass211 = mockk()
val mock212: HelloClass212 = mockk()
val mock213: HelloClass213 = mockk()
val mock214: HelloClass214 = mockk()
val mock215: HelloClass215 = mockk()
val mock216: HelloClass216 = mockk()
val mock217: HelloClass217 = mockk()
val mock218: HelloClass218 = mockk()
val mock219: HelloClass219 = mockk()
val mock220: HelloClass220 = mockk()
val mock221: HelloClass221 = mockk()
val mock222: HelloClass222 = mockk()
val mock223: HelloClass223 = mockk()
val mock224: HelloClass224 = mockk()
val mock225: HelloClass225 = mockk()
val mock226: HelloClass226 = mockk()
val mock227: HelloClass227 = mockk()
val mock228: HelloClass228 = mockk()
val mock229: HelloClass229 = mockk()
val mock230: HelloClass230 = mockk()
val mock231: HelloClass231 = mockk()
val mock232: HelloClass232 = mockk()
val mock233: HelloClass233 = mockk()
val mock234: HelloClass234 = mockk()
val mock235: HelloClass235 = mockk()
val mock236: HelloClass236 = mockk()
val mock237: HelloClass237 = mockk()
val mock238: HelloClass238 = mockk()
val mock239: HelloClass239 = mockk()
val mock240: HelloClass240 = mockk()
val mock241: HelloClass241 = mockk()
val mock242: HelloClass242 = mockk()
val mock243: HelloClass243 = mockk()
val mock244: HelloClass244 = mockk()
val mock245: HelloClass245 = mockk()
val mock246: HelloClass246 = mockk()
val mock247: HelloClass247 = mockk()
val mock248: HelloClass248 = mockk()
val mock249: HelloClass249 = mockk()
val mock250: HelloClass250 = mockk()
val mock251: HelloClass251 = mockk()
val mock252: HelloClass252 = mockk()
val mock253: HelloClass253 = mockk()
val mock254: HelloClass254 = mockk()
val mock255: HelloClass255 = mockk()
val mock256: HelloClass256 = mockk()
val mock257: HelloClass257 = mockk()
val mock258: HelloClass258 = mockk()
val mock259: HelloClass259 = mockk()
val mock260: HelloClass260 = mockk()
val mock261: HelloClass261 = mockk()
val mock262: HelloClass262 = mockk()
val mock263: HelloClass263 = mockk()
val mock264: HelloClass264 = mockk()
val mock265: HelloClass265 = mockk()
val mock266: HelloClass266 = mockk()
val mock267: HelloClass267 = mockk()
val mock268: HelloClass268 = mockk()
val mock269: HelloClass269 = mockk()
val mock270: HelloClass270 = mockk()
val mock271: HelloClass271 = mockk()
val mock272: HelloClass272 = mockk()
val mock273: HelloClass273 = mockk()
val mock274: HelloClass274 = mockk()
val mock275: HelloClass275 = mockk()
val mock276: HelloClass276 = mockk()
val mock277: HelloClass277 = mockk()
val mock278: HelloClass278 = mockk()
val mock279: HelloClass279 = mockk()
val mock280: HelloClass280 = mockk()
val mock281: HelloClass281 = mockk()
val mock282: HelloClass282 = mockk()
val mock283: HelloClass283 = mockk()
val mock284: HelloClass284 = mockk()
val mock285: HelloClass285 = mockk()
val mock286: HelloClass286 = mockk()
val mock287: HelloClass287 = mockk()
val mock288: HelloClass288 = mockk()
val mock289: HelloClass289 = mockk()
val mock290: HelloClass290 = mockk()
val mock291: HelloClass291 = mockk()
val mock292: HelloClass292 = mockk()
val mock293: HelloClass293 = mockk()
val mock294: HelloClass294 = mockk()
val mock295: HelloClass295 = mockk()
val mock296: HelloClass296 = mockk()
val mock297: HelloClass297 = mockk()
val mock298: HelloClass298 = mockk()
val mock299: HelloClass299 = mockk()
val mock300: HelloClass300 = mockk()
val mock301: HelloClass301 = mockk()
val mock302: HelloClass302 = mockk()
val mock303: HelloClass303 = mockk()
val mock304: HelloClass304 = mockk()
val mock305: HelloClass305 = mockk()
val mock306: HelloClass306 = mockk()
val mock307: HelloClass307 = mockk()
val mock308: HelloClass308 = mockk()
val mock309: HelloClass309 = mockk()
val mock310: HelloClass310 = mockk()
val mock311: HelloClass311 = mockk()
val mock312: HelloClass312 = mockk()
val mock313: HelloClass313 = mockk()
val mock314: HelloClass314 = mockk()
val mock315: HelloClass315 = mockk()
val mock316: HelloClass316 = mockk()
val mock317: HelloClass317 = mockk()
val mock318: HelloClass318 = mockk()
val mock319: HelloClass319 = mockk()
val mock320: HelloClass320 = mockk()
val mock321: HelloClass321 = mockk()
val mock322: HelloClass322 = mockk()
val mock323: HelloClass323 = mockk()
val mock324: HelloClass324 = mockk()
val mock325: HelloClass325 = mockk()
val mock326: HelloClass326 = mockk()
val mock327: HelloClass327 = mockk()
val mock328: HelloClass328 = mockk()
val mock329: HelloClass329 = mockk()
val mock330: HelloClass330 = mockk()
val mock331: HelloClass331 = mockk()
val mock332: HelloClass332 = mockk()
val mock333: HelloClass333 = mockk()
val mock334: HelloClass334 = mockk()
val mock335: HelloClass335 = mockk()
val mock336: HelloClass336 = mockk()
val mock337: HelloClass337 = mockk()
val mock338: HelloClass338 = mockk()
val mock339: HelloClass339 = mockk()
val mock340: HelloClass340 = mockk()
val mock341: HelloClass341 = mockk()
val mock342: HelloClass342 = mockk()
val mock343: HelloClass343 = mockk()
val mock344: HelloClass344 = mockk()
val mock345: HelloClass345 = mockk()
val mock346: HelloClass346 = mockk()
val mock347: HelloClass347 = mockk()
val mock348: HelloClass348 = mockk()
val mock349: HelloClass349 = mockk()
val mock350: HelloClass350 = mockk()
val mock351: HelloClass351 = mockk()
val mock352: HelloClass352 = mockk()
val mock353: HelloClass353 = mockk()
val mock354: HelloClass354 = mockk()
val mock355: HelloClass355 = mockk()
val mock356: HelloClass356 = mockk()
val mock357: HelloClass357 = mockk()
val mock358: HelloClass358 = mockk()
val mock359: HelloClass359 = mockk()
val mock360: HelloClass360 = mockk()
val mock361: HelloClass361 = mockk()
val mock362: HelloClass362 = mockk()
val mock363: HelloClass363 = mockk()
val mock364: HelloClass364 = mockk()
val mock365: HelloClass365 = mockk()
val mock366: HelloClass366 = mockk()
val mock367: HelloClass367 = mockk()
val mock368: HelloClass368 = mockk()
val mock369: HelloClass369 = mockk()
val mock370: HelloClass370 = mockk()
val mock371: HelloClass371 = mockk()
val mock372: HelloClass372 = mockk()
val mock373: HelloClass373 = mockk()
val mock374: HelloClass374 = mockk()
val mock375: HelloClass375 = mockk()
val mock376: HelloClass376 = mockk()
val mock377: HelloClass377 = mockk()
val mock378: HelloClass378 = mockk()
val mock379: HelloClass379 = mockk()
val mock380: HelloClass380 = mockk()
val mock381: HelloClass381 = mockk()
val mock382: HelloClass382 = mockk()
val mock383: HelloClass383 = mockk()
val mock384: HelloClass384 = mockk()
val mock385: HelloClass385 = mockk()
val mock386: HelloClass386 = mockk()
val mock387: HelloClass387 = mockk()
val mock388: HelloClass388 = mockk()
val mock389: HelloClass389 = mockk()
val mock390: HelloClass390 = mockk()
val mock391: HelloClass391 = mockk()
val mock392: HelloClass392 = mockk()
val mock393: HelloClass393 = mockk()
val mock394: HelloClass394 = mockk()
val mock395: HelloClass395 = mockk()
val mock396: HelloClass396 = mockk()
val mock397: HelloClass397 = mockk()
val mock398: HelloClass398 = mockk()
val mock399: HelloClass399 = mockk()
val mock400: HelloClass400 = mockk()

val mocks = listOf<HelloClass>(
mock1,
mock2,
mock3,
mock4,
mock5,
mock6,
mock7,
mock8,
mock9,
mock10,
mock11,
mock12,
mock13,
mock14,
mock15,
mock16,
mock17,
mock18,
mock19,
mock20,
mock21,
mock22,
mock23,
mock24,
mock25,
mock26,
mock27,
mock28,
mock29,
mock30,
mock31,
mock32,
mock33,
mock34,
mock35,
mock36,
mock37,
mock38,
mock39,
mock40,
mock41,
mock42,
mock43,
mock44,
mock45,
mock46,
mock47,
mock48,
mock49,
mock50,
mock51,
mock52,
mock53,
mock54,
mock55,
mock56,
mock57,
mock58,
mock59,
mock60,
mock61,
mock62,
mock63,
mock64,
mock65,
mock66,
mock67,
mock68,
mock69,
mock70,
mock71,
mock72,
mock73,
mock74,
mock75,
mock76,
mock77,
mock78,
mock79,
mock80,
mock81,
mock82,
mock83,
mock84,
mock85,
mock86,
mock87,
mock88,
mock89,
mock90,
mock91,
mock92,
mock93,
mock94,
mock95,
mock96,
mock97,
mock98,
mock99,
mock100,
mock101,
mock102,
mock103,
mock104,
mock105,
mock106,
mock107,
mock108,
mock109,
mock110,
mock111,
mock112,
mock113,
mock114,
mock115,
mock116,
mock117,
mock118,
mock119,
mock120,
mock121,
mock122,
mock123,
mock124,
mock125,
mock126,
mock127,
mock128,
mock129,
mock130,
mock131,
mock132,
mock133,
mock134,
mock135,
mock136,
mock137,
mock138,
mock139,
mock140,
mock141,
mock142,
mock143,
mock144,
mock145,
mock146,
mock147,
mock148,
mock149,
mock150,
mock151,
mock152,
mock153,
mock154,
mock155,
mock156,
mock157,
mock158,
mock159,
mock160,
mock161,
mock162,
mock163,
mock164,
mock165,
mock166,
mock167,
mock168,
mock169,
mock170,
mock171,
mock172,
mock173,
mock174,
mock175,
mock176,
mock177,
mock178,
mock179,
mock180,
mock181,
mock182,
mock183,
mock184,
mock185,
mock186,
mock187,
mock188,
mock189,
mock190,
mock191,
mock192,
mock193,
mock194,
mock195,
mock196,
mock197,
mock198,
mock199,
mock200,
mock201,
mock202,
mock203,
mock204,
mock205,
mock206,
mock207,
mock208,
mock209,
mock210,
mock211,
mock212,
mock213,
mock214,
mock215,
mock216,
mock217,
mock218,
mock219,
mock220,
mock221,
mock222,
mock223,
mock224,
mock225,
mock226,
mock227,
mock228,
mock229,
mock230,
mock231,
mock232,
mock233,
mock234,
mock235,
mock236,
mock237,
mock238,
mock239,
mock240,
mock241,
mock242,
mock243,
mock244,
mock245,
mock246,
mock247,
mock248,
mock249,
mock250,
mock251,
mock252,
mock253,
mock254,
mock255,
mock256,
mock257,
mock258,
mock259,
mock260,
mock261,
mock262,
mock263,
mock264,
mock265,
mock266,
mock267,
mock268,
mock269,
mock270,
mock271,
mock272,
mock273,
mock274,
mock275,
mock276,
mock277,
mock278,
mock279,
mock280,
mock281,
mock282,
mock283,
mock284,
mock285,
mock286,
mock287,
mock288,
mock289,
mock290,
mock291,
mock292,
mock293,
mock294,
mock295,
mock296,
mock297,
mock298,
mock299,
mock300,
mock301,
mock302,
mock303,
mock304,
mock305,
mock306,
mock307,
mock308,
mock309,
mock310,
mock311,
mock312,
mock313,
mock314,
mock315,
mock316,
mock317,
mock318,
mock319,
mock320,
mock321,
mock322,
mock323,
mock324,
mock325,
mock326,
mock327,
mock328,
mock329,
mock330,
mock331,
mock332,
mock333,
mock334,
mock335,
mock336,
mock337,
mock338,
mock339,
mock340,
mock341,
mock342,
mock343,
mock344,
mock345,
mock346,
mock347,
mock348,
mock349,
mock350,
mock351,
mock352,
mock353,
mock354,
mock355,
mock356,
mock357,
mock358,
mock359,
mock360,
mock361,
mock362,
mock363,
mock364,
mock365,
mock366,
mock367,
mock368,
mock369,
mock370,
mock371,
mock372,
mock373,
mock374,
mock375,
mock376,
mock377,
mock378,
mock379,
mock380,
mock381,
mock382,
mock383,
mock384,
mock385,
mock386,
mock387,
mock388,
mock389,
mock390,
mock391,
mock392,
mock393,
mock394,
mock395,
mock396,
mock397,
mock398,
mock399,
mock400,
)

    @Test
    fun stubbing() {
        mocks.forEach {
            mocks.forEach {
                every {
                    it.sayHello("Hello!")
                }.returnsMany("not hello")
            }
        }

        mocks.forEach {
            mocks.forEach { mock ->
                assertEquals(expected = "not hello", actual = mock.sayHello("Hello!"), "mock: $mock")
            }
        }
    }

    @Test
    fun pass() {
        Assert.assertTrue(true)
    }
}
