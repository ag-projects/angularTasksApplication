import {EventEmitter, Injectable} from "@angular/core";
import "rxjs/add/operator/map";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {Task} from "./task.model";


@Injectable()
export class TaskService {


    onTaskAdded = new EventEmitter<Task>();

    constructor(private http: HttpClient) {

    }

    getTaskList(): Observable<Task[]> {
        return this.http.get<Task[]>('/api/tasks');
    }

    saveTask(task: Task, checked: boolean) {
        task.completed = checked;
        return this.http.post('/api/tasks/save', task, {
            headers: new HttpHeaders().set('Authorization', 'my-auth-token'),
        });

    }


    addTask(task: Task) {
        return this.http.post('/api/task/save', task);
    }
}
