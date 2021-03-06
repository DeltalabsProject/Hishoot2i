package org.illegaller.ratabb.hishoot2i.di.module;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.view.WindowManager;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module public class SystemServiceModule {

  @SuppressWarnings("unchecked") <T> T getSystemService(Context context, String serviceName) {
    return (T) context.getSystemService(serviceName);
  }

  @Provides @Singleton WindowManager provideWindowManager(Application app) {
    return getSystemService(app.getApplicationContext(), Context.WINDOW_SERVICE);
  }

  @Provides @Singleton NotificationManager provideNotificationManager(Application app) {
    return getSystemService(app.getApplicationContext(), Context.NOTIFICATION_SERVICE);
  }
}
