package ro.razvan.githubproject.dependencyinjection;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import ro.razvan.githubproject.activity.MainActivity;

@Module
public abstract class WowApplicationModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}
