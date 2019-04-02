package arsenic.support.lottie.model.animatable;

import arsenic.support.lottie.value.Keyframe;
import arsenic.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import arsenic.support.lottie.animation.keyframe.ColorKeyframeAnimation;

import java.util.List;

public class AnimatableColorValue extends BaseAnimatableValue<Integer, Integer> {
  public AnimatableColorValue(List<Keyframe<Integer>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<Integer, Integer> createAnimation() {
    return new ColorKeyframeAnimation(keyframes);
  }
}
