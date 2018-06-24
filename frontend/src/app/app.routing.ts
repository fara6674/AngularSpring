import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home';
import { LoginComponent } from './login';
import { RegisterComponent } from './register';
import {SignInComponent} from './signIn';
import {AboutComponent} from './about';
import {DashBoardComponent} from './dashboard';
import {CreateComponent} from './create';
import { AuthGuard } from './_guards';

const appRoutes: Routes = [
    { path: '', component: HomeComponent}, //, canActivate: [AuthGuard] },
    { path: 'login', component: LoginComponent },
    { path: 'register', component: RegisterComponent },
    { path: 'base', component: SignInComponent },
    { path: 'about', component: AboutComponent },
    { path: 'dashboard', component: DashBoardComponent},
    { path: 'create', component: CreateComponent},
    // otherwise redirect to home
    { path: '**', redirectTo: '' }
];

export const routing = RouterModule.forRoot(appRoutes);