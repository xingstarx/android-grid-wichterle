// Generated code from Butter Knife. Do not modify!
package eu.inmite.android.gridwichterle.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class SettingsActivity$$ViewInjector<T extends eu.inmite.android.gridwichterle.activity.SettingsActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131099651, "field 'txtGridSize'");
    target.txtGridSize = finder.castView(view, 2131099651, "field 'txtGridSize'");
    view = finder.findRequiredView(source, 2131099659, "field 'txtVersion'");
    target.txtVersion = finder.castView(view, 2131099659, "field 'txtVersion'");
    view = finder.findRequiredView(source, 2131099658, "field 'txtSendFeedback'");
    target.txtSendFeedback = finder.castView(view, 2131099658, "field 'txtSendFeedback'");
    view = finder.findRequiredView(source, 2131099657, "field 'txtTheCode'");
    target.txtTheCode = finder.castView(view, 2131099657, "field 'txtTheCode'");
    view = finder.findRequiredView(source, 2131099652, "field 'seekBar'");
    target.seekBar = finder.castView(view, 2131099652, "field 'seekBar'");
    view = finder.findRequiredView(source, 2131099653, "field 'layoutColor'");
    target.layoutColor = finder.castView(view, 2131099653, "field 'layoutColor'");
    view = finder.findRequiredView(source, 2131099654, "field 'viewColor'");
    target.viewColor = view;
    view = finder.findRequiredView(source, 2131099655, "field 'chckFullScreen'");
    target.chckFullScreen = finder.castView(view, 2131099655, "field 'chckFullScreen'");
    view = finder.findRequiredView(source, 2131099656, "field 'layoutDevelopers'");
    target.layoutDevelopers = finder.castView(view, 2131099656, "field 'layoutDevelopers'");
    view = finder.findRequiredView(source, 2131099649, "field 'switchGrid'");
    target.switchGrid = finder.castView(view, 2131099649, "field 'switchGrid'");
  }

  @Override public void reset(T target) {
    target.txtGridSize = null;
    target.txtVersion = null;
    target.txtSendFeedback = null;
    target.txtTheCode = null;
    target.seekBar = null;
    target.layoutColor = null;
    target.viewColor = null;
    target.chckFullScreen = null;
    target.layoutDevelopers = null;
    target.switchGrid = null;
  }
}
