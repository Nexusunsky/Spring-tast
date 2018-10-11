package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author: haoliu on 2018/10/12 07:05
 */
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("SgtPeppers");
    }
}
