package cd.zgeniuscoders.kzgen

import android.app.Application
import cd.zgeniuscoders.kzgen.products.productModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(applicationContext)
            modules(
                productModule

            )
        }
    }

}