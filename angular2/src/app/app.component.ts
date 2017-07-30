import { Component, OnInit } from '@angular/core';
import { LoggerService } from "./logger.service";

@Component({
  selector: 'my-app',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  private greeting: string;
  private isShowMore: boolean;
  private msgToChild: string;
  private msgFromChild: string;

  constructor(private logger: LoggerService) {}

  ngOnInit(): void {
    this.greeting = 'Angular 2';
    this.msgToChild = "Message from parent";
    this.logger.debug("根组件初始化完毕");
  }

  receive(msg: string) {
    this.msgFromChild = msg;
  }
}
