package nursing.depression.no_stress_no_sad_app;

public class DepressResults {
    public static String[] depressResultValue = {
            "คุณปกติ ถือว่าไม่มีภาวะซึมเศร้า",
            "ไม่มีภาวะซึมเศร้า 0-6 คะแนน",
            "ภาวะซึมเศร้าระดับเล็กน้อย (Mild Depression) 7- 12 คะแนน",
            "ภาวะซึมเศร้าระดับปานกลาง (Moderate Depression) 13-18 คะแนน",
            "ภาวะซึมเศร้าระดับรุนแรง (Severe Depression) มากกว่า 19 คะแนน"
    };
    public static String[] depressResultDescription = {
            "ในช่วงสองสัปดาห์ที่ผ่านมาไม่มีอาการแสดงที่เสี่ยงต่อการเป็นภาวะซึมเศร้า",
            "เป็นภาวะอารมณ์ที่ไม่สดชื่น แจ่มใส อารมณ์เศร้า เหงาหงอยชั่วคราวซึ่งบุคคลทั่วไปรู้สึกได้ในบางครั้ง การนอนลดลง อาจหลับยากหรือตื่นเช้ากว่าปกติ  อาจมีสาเหตุหรือไม่ก็ได้ เริ่มคิดลบเปรียบเทียบตนกับผู้อื่น ความตั้งใจทำงานต่าง ๆ ลดลง  แนะนำให้พบแพทย์หรือปรึกษาผู้เชี่ยวชาญ",
            "มีอารมณ์ซึมเศร้ารุนแรงขึ้น จนมีผลกระทบต่อชีวิตครอบครัวและการงาน แต่ยังสามารถดำเนินชีวิตประจำวันได้แต่อาจไม่สมบูรณ์ อาการเป็นมากช่วงเช้า รู้สึกไม่มีความสุข เบื่อหน่ายต่อสิ่งต่างๆ อ่อนเพลีย มีพละกำลังลดลง รู้สึกตนเองไร้ค่า ตำหนิตนเอง หงุดหงิด ร้องไห้ง่าย โกรธง่าย กังวลกับสุขภาพ หลีกหนีสังคม แยกตัว อาจคิดอยากตาย ไม่อยากอาหาร น้ำหนักลด คุณสามารถคลายเครียดด้วยตนเอง เช่น การพูดคุยระบายความรู้สึก  การนวด  การฟังเพลง  การทำสมาธิ  การผ่อนคลายกล้ามเนื้อ แนะนำให้พบแพทย์หรือปรึกษาผู้เชี่ยวชาญ",
            " มีอารมณ์เศร้าตลอดเวลา สิ้นหวัง มองตนเองด้านลบ ไม่มีคุณค่า คิดอยากตายมากขึ้น แยกตัวมากขึ้น สิ้นหวัง มองไม่เห็นอนาคต การตัดสินใจเสียแม้เรื่องง่ายในชีวิตประจำวันไม่สนใจดูแลตนเอง อาจนั่งอยู่ท่าเดียวนาน ๆ หรือกระวนกระวายอยู่ไม่สุข นอนน้อยลง อ่อนเพลีย บางคนไม่อยู่ในโลกแห่งความเป็นจริง คุณสามารถคลายเครียดด้วยตนเอง เช่น การพูดคุยระบายความรู้สึก  การนวด  การฟังเพลง  การทำสมาธิ  การผ่อนคลายกล้ามเนื้อ  แนะนำให้พบแพทย์หรือปรึกษาผู้เชี่ยวชาญ"
    };
    public static String getDepressResultValue(int a) {
        String value = depressResultValue[a];
        return value;
    }
    public static String getDepressResultDescription(int a) {
        String description = depressResultDescription[a];
        return description;
    }
}
