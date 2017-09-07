import { Component } from '@angular/core';
import { UserService } from "./user/user.service";

@Component({
    selector: 'injector',
    template: `
    <h2>User</h2>
    <p id="user">
        {{userInfo}}
        <button (click)="changeUser()">Next User</button>
    </p>
    <!--通过*ngIf来控制显示heros-->
    <my-heros id="authorized" *ngIf="isAuthorized"></my-heros>
    <my-heros id="unauthorized" *ngIf="!isAuthorized"></my-heros>
    `
})
export class InjectComponent {
    constructor(private userService: UserService) { }

    changeUser() {
        this.userService.getNewUser();
    }

    get user() {
        return this.userService.user;
    }

    get isAuthorized() {
        return this.user.isAuthorized;
    }

    get userInfo() {
        return `Current user, ${this.user.name}, is ` +
            `${this.isAuthorized ? '' : 'not'} authorized. `;
    }
}