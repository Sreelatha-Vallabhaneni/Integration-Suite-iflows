import com.sap.gateway.ip.core.customdev.util.Message;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

def Message processData(Message message) {
    // 1. ప్రస్తుత సమయాన్ని తీసుకోవడం
    def date = new Date();
    
    // 2. డేట్ ఫార్మాట్ సెట్ చేయడం
    def sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    // 3. డెన్మార్క్ టైమ్ జోన్‌ని సెట్ చేయడం
    sdf.setTimeZone(TimeZone.getTimeZone("Europe/Copenhagen")); 
    
    // 4. టైమ్‌ని ఫార్మాట్ చేయడం
    def denmarkTime = sdf.format(date);
    
    // 5. దీనిని 'denmark_time' అనే Property లో స్టోర్ చేయడం
    message.setProperty("denmark_time", denmarkTime);
    
    return message;
}
