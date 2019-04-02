package arsenic.support.lottie.model.content;


import android.support.annotation.Nullable;

import arsenic.support.lottie.LottieDrawable;
import arsenic.support.lottie.animation.content.Content;
import arsenic.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
