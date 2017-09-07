import { Injectable } from '@angular/core';
import {User} from './user';
import { USERS } from "../mock/mock-users";

@Injectable()
export class UserService {
    user = USERS[0];

    constructor() {
    }

    getNewUser(){
        return this.user = this.user === USERS[0] ? USERS[1] : USERS[0];
    }
}