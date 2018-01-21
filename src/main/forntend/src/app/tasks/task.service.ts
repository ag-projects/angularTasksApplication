import {Injectable} from "@angular/core";
import "rxjs/add/operator/map";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {Task} from "./task.model";


@Injectable()
export class TaskService {


    constructor(private http: HttpClient) {

    }

    getTaskList(): Observable<Task[]> {
        return this.http.get<Task[]>('/api/tasks');
    }

}
