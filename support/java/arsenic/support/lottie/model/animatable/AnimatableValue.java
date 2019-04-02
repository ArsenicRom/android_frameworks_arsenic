package arsenic.support.lottie.model.animatable;

import arsenic.support.lottie.animation.keyframe.BaseKeyframeAnimation;

public interface AnimatableValue<K, A> {
  BaseKeyframeAnimation<K, A> createAnimation();
}
