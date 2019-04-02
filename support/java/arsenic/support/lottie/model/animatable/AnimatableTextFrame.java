package arsenic.support.lottie.model.animatable;

import arsenic.support.lottie.value.Keyframe;
import arsenic.support.lottie.animation.keyframe.TextKeyframeAnimation;
import arsenic.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
