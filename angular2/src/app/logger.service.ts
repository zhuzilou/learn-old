import { Injectable } from "@angular/core";

/** 自定义服务*/
@Injectable()
export class LoggerService {
    constructor() {}
     debug(msg: string) {
         console.log(msg);
     }
}
