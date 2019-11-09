package commandPattern;

/**
 * @description:
 * @author: zhangtf
 * @create: 2019-07-31 17:40
 */
public class StereoOffWithCDCommand implements Command{
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void execute() {
       stereo.off();
    }

    @Override
    public void undo() {

    }
}
