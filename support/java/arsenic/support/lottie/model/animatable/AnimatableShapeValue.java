package arsenic.support.lottie.model.animatable;

import android.graphics.Path;

import arsenic.support.lottie.value.Keyframe;
import arsenic.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import arsenic.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import arsenic.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
