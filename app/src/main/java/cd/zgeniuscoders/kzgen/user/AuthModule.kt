package cd.zgeniuscoders.kzgen.user

import cd.zgeniuscoders.kzgen.user.ui.views.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val authModule = module {

    viewModel<RegisterViewModel> {
        RegisterViewModel()
    }

}