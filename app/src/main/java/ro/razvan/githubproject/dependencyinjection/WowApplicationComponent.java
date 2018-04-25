package ro.razvan.githubproject.dependencyinjection;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.AndroidInjectionModule;
import ro.razvan.githubproject.WowApplication;

@Component(modules={AndroidInjectionModule.class,WowApplicationModule.class})
public interface WowApplicationComponent extends AndroidInjector<WowApplication>{
}
