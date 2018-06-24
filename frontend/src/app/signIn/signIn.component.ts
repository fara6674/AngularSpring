import { Component, OnInit, OnDestroy } from '@angular/core';
import { User } from '../_models';
import { UserService } from '../_services';
import { first } from 'rxjs/operators';
@Component({
    selector: 'base',
    templateUrl: 'signIn.component.html'
})
export class SignInComponent implements OnInit{
    currentUser: User;
    users: User[] = [];
    
    constructor(private userService: UserService) {
        this.currentUser = JSON.parse(localStorage.getItem('currentUser'));
    }

    ngOnInit() {
        this.loadAllUsers();
    }
    deleteUser(id: number) {
        this.userService.delete(id).pipe(first()).subscribe(() => { 
            this.loadAllUsers() 
        });
    }
    private loadAllUsers() {
        this.userService.getAll().pipe(first()).subscribe(users => { 
            this.users = users; 
        });
    }
}