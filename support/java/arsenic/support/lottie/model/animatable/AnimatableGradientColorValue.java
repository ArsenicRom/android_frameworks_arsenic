package arsenic.support.lottie.model.animatable;

import arsenic.support.lottie.value.Keyframe;
import arsenic.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import arsenic.support.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import arsenic.support.lottie.model.content.GradientColor;

import java.util.List;

public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor,
    GradientColor> {
  public AnimatableGradientColorValue(
      List<Keyframe<GradientColor>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
    return new GradientColorKeyframeAnimation(keyframes);
  }
}
